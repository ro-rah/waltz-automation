pipeline{
agent any
    stages{
        stage('Test Stage'){
            steps{
                withMaven(maven:maven){
                    sh 'mvn clean test'
                }
            }

        }
    }
}