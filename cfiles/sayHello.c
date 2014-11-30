#include "stdio.h"
#include "demo_DemoJni.h"

JNIEXPORT jstring JNICALL Java_demo_DemoJni_sayHello
  (JNIEnv *env, jclass jc, jstring name)
{
	return name;
}



