def call(String appName, String appVersion) {
    echo "Building Docker image: ${appName}:${appVersion}"
    sh "docker build -t ${appName}:${appVersion} ."
    echo "✅ Docker image built successfully."
}
