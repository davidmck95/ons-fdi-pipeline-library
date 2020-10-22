/**
 * Function to run and log the output of the npm run lint command
 * @param service - name of the service on which the lint is being performed
 * @return boolean related to success of the audit
 */
def boolean call(String service) {
    echo("Linting ${service}")
    boolean result
    try {
        boolean auditExitCode = sh (script: 'npm run lint', returnStatus: true) == 0
        if (auditExitCode) {
            result = true
            echo "Successfully linted ${service}"
        } else {
            result = false
            echo "[ERROR] Linting failed for ${service}"
        }
        return result
    } catch (Exception e) {
        echo "[ERROR] Failed to lint ${service}"
        echo "[ERROR] Exception: ${e}"
    }
}