def call(String service) {
    echo("Creating NPM audit report for ${service}")
    try {
        sh script: "cd ${service} && npm audit | tail"
        echo "Successfully generated NPM audit report for ${service}"
    } catch (Exception e) {
        echo "Failed to generate NPM audit report for ${service}"
    }
}