def boolean call(String service) {
    echo("Creating NPM audit report for ${service}")
    boolean result
    try {
        boolean auditExitCode = sh (script: 'npm audit', returnStatus: true) == 0
        if (auditExitCode) {
            result = true
            echo "Successfully generated NPM audit report for ${service}"
        } else {
            result = false
            echo "[ERROR] NPM audit failed for ${service}"
        }
        return result
    } catch (Exception e) {
        echo "[ERROR] Failed to generate NPM audit report for ${service}"
        echo "[ERROR] Exception: ${e}"
    }
}