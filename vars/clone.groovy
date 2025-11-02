def call(String GitUrl, String GitBranch) {
    echo "Cloning repository from ${GitUrl} (branch: ${GitBranch})..."
    git url: "${GitUrl}", branch: "${GitBranch}"
    echo "Repository cloned successfully."
}
