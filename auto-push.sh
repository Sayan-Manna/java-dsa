#!/bin/bash
PROJECT_DIR="/Users/sayanmanna/Basic_Codes"
BRANCH="main"
LOG_FILE="/tmp/auto-push.log"

# Function to log with timestamp
log() {
    echo "[$(date '+%Y-%m-%d %H:%M:%S')] $1" | tee -a "$LOG_FILE"
}

# Change to project directory
cd "$PROJECT_DIR" || {
    log "❌ ERROR: Cannot access project directory: $PROJECT_DIR"
    exit 1
}

# Check if IntelliJ is running (multiple ways to catch it)
if pgrep -f "IntelliJ" > /dev/null || pgrep -f "idea" > /dev/null || pgrep -f "jetbrains" > /dev/null; then
    log "✅ IntelliJ is active, checking for changes..."

    # Check if there are any changes to commit
    if [[ -n $(git status --porcelain) ]]; then
        log "📝 Changes detected, committing and pushing..."

        # Add all changes
        git add . 2>/dev/null

        # Commit with timestamp
        if git commit -m "Auto-commit while IntelliJ active: $(date '+%Y-%m-%d %H:%M:%S')" 2>/dev/null; then
            log "✅ Changes committed successfully"

            # Push to remote
            if git push origin "$BRANCH" 2>/dev/null; then
                log "🚀 Successfully pushed to GitHub"
            else
                log "❌ Failed to push to GitHub - check network/permissions"
            fi
        else
            log "❌ Failed to commit changes"
        fi
    else
        log "📋 No changes to commit"
    fi
else
    log "💤 IntelliJ not running, skipping push"
fi