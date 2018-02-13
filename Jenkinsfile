#!/usr/bin/env groovy

pipeline {
    agent {
        label 'docker'
    }
    options {
        buildDiscarder(logRotator(numToKeepStr:'10'))
        disableConcurrentBuilds()
    }
    environment {
        COMPOSE_PROJECT_NAME = 'seed'
        SAG_AQUARIUS = 'aquarius-bg.eur.ad.sag'
        CC_PASSWORD = "manage" // does NOT work with non default!!!
    }
    stages {
        stage("Provision Command Central") {
            steps {
                timeout(time:30, unit:'MINUTES') {
                    sh 'docker-compose pull' // pull latest images
                    sh 'docker-compose run init' // launch containers, init CC
                    sh 'docker-compose run --rm init sagcc list repository fixes -e GA_Fix_Repo -w 300' // wait for CC self-init
                    sh 'docker-compose port cc 8091' // print dynamic port assigment for CC
                }
            }
        }        
        stage("Test Provision GA Stack") {
            environment {
                CC_ENV = 'default'
                TEST_SUITE = '**/AcceptanceTestSuite.class'
            }
            steps {
                timeout(time:60, unit:'MINUTES') {
                    sh "docker-compose run --rm test"
                }
            }
            post {
                always {
                    junit "**/$CC_ENV/TEST-*.xml"
                }
            }
        }
        stage("Test Apply Fixes") {
            environment {
                CC_ENV = 'fixes'
                TEST_SUITE = '**/AcceptanceTestSuite.class'
            }            
            steps {
                timeout(time:60, unit:'MINUTES') {
                    sh "docker-compose run --rm test"
                }
            }
            post {
                always {
                    junit "**/$CC_ENV/TEST-*.xml"
                }
            }
        }        
        // stage("Test Modify Configs") {
        //     environment {
        //         CC_ENV = 'configs'
        //         TEST_SUITE = '**/AcceptanceTestSuite.class'
        //     }   
        //     steps {
        //         timeout(time:30, unit:'MINUTES') {
        //             sh "docker-compose run --rm test"
        //         }
        //     }
        //     post {
        //         always {
        //             junit "**/$CC_ENV/TEST-*.xml"
        //         }
        //     }
        // }
        // stage("Test extended") {
        //     environment {
        //         CC_ENV = 'extended'
        //         TEST_SUITE = '**/AcceptanceExtendedTestSuite.class'
        //     }   
        //     steps {
        //         timeout(time:30, unit:'MINUTES') {
        //             sh "docker-compose run --rm test"
        //         }
        //     }
        //     post {
        //         always {
        //             junit "**/$CC_ENV/TEST-*.xml"
        //         }
        //     }
        // }   
        // stage("Test product") {
        //     steps {
        //         echo "TODO: run product specific smoke tests"
        //     }
        // }               
    }
    post {
        always {
            sh 'docker-compose down' // cleanup
        }
    }
}