def call(String msg) {
  echo msg
  sh """
    pwd
  """
}
