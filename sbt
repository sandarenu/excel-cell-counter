java -Xms512M -Xmx1536M -Xss1M -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=384M -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5006 -jar `dirname $0`/sbt-launch.jar "$@"
