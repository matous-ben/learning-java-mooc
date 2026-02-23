#!/usr/bin/env bash
# Run this after downloading new exercises in VS Code TMC.
# It adds any new exercise folders to pom.xml so IntelliJ picks them up.
set -e

POM="$(dirname "$0")/pom.xml"
CHANGED=0

for dir in "$(dirname "$0")"/part*-*/; do
    module=$(basename "$dir")
    if ! grep -q "<module>$module</module>" "$POM"; then
        # Insert before closing </modules> tag
        sed -i "s|    </modules>|        <module>$module</module>\n    </modules>|" "$POM"
        echo "Added: $module"
        CHANGED=1
    fi
done

if [ $CHANGED -eq 0 ]; then
    echo "pom.xml already up to date."
else
    echo ""
    echo "Done! Now in IntelliJ: Maven panel (right side) → Reload All Maven Projects"
fi
