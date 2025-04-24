def call(String imageName, String imageTag, String DockerhubUser){
  sh "docker build -t ${DockerhubUser}/${imageName}:${imageTag} ."
}
