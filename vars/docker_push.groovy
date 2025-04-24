def call(String imageName, String imageTag, String dockerhubuser){
  echo "pushing image to dockerhub"
  withCredentials([usernamePassword(
         "credentialsId":"docker",
          passwordVariable:"dockerhubpass",
          usernameVariable:"dockerhubuser")]){
    
          sh "docker login -u $dockerhubuser -p $dockerhubpass"
          sh "docker push ${dockerhubuser}/${imageName}:${imageTag}"
      }
}
