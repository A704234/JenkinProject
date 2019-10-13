pipeline {
    agent any 
        stages {
            stage('One') {
                steps {
                    echo 'Hi, this is Sachin from AtoS'
                }
            }
            
            stage('Two') {
                steps {
                    input('Do you want to proceed ?')
                }
            }
            
            stage('Three') {
                steps {
                    when {
                        not {
                            branch 'master'
                        }
                    }
                    steps {
                         input('Do you want to proceed ?')
                    }
                }
            }
            
            stage('Four'){
                parallel {
                    stage('UnitTest'){
                        steps {
                            echo "Running the unit test..."
                        }
                    }
                    
                    stage{
                        agent {
                            docker {
                                reuseNode false
                                image 'ubuntu'
                            }
                        }
                        steps {
                            echo 'running the integration test...'
                        }
                    }
                }
            }
        }
}
