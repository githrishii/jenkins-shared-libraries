def call(String imageName, String imageTag, String dockerhubUser){
  echo "pushing image to dockerhub"
  withCredentials([usernamePassword(
         "credentialsId":"docker",
          passwordVariable:"dockerhubpass",
          usernameVariable:"dockerhubuser")]){
    
          sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
          sh "docker push ${dockerhubUser}/${imageName}:${imageTag}"
      }
}
