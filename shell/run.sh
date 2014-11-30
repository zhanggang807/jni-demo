pwd_path=$PWD
echo "current path is : "$pwd_path
so_path=$pwd_path/../cfiles
echo "so library path is : "$so_path
class_path=$pwd_path/../bin
echo "java classpth is : "$class_path
java -Djava.library.path=$so_path  -classpath $class_path demo.DemoJni
