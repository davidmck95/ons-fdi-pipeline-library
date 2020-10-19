/**
 * Function to run and log the output of the npm audit command
 * @param service - name of the service on which the NPM audit action is being performed
 * @return boolean related to success of the audit
 */
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