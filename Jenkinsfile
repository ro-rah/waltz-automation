pipeline{
agent any
    stages{
        stage('Test Stage'){
            steps{
                withMaven(maven:'maven'){
                    bat 'mvn clean test'
                }
            }

        }
    }
}