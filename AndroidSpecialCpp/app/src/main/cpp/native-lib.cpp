#include <jni.h>
#include <string>

#include <android/log.h>

void writeFile(const char* FilePath, const char *buff, long fileSize)
{
    FILE *pFile = fopen(FilePath, "wb");
    if (pFile == NULL)
    {
        return;
    }

    fwrite(buff, fileSize, 1, pFile);
    fclose(pFile);
}
char* readFile(const char* FilePath, long &fileSize)
{
    FILE *pFile = fopen(FilePath, "rb");

    if (pFile == NULL)
        return "";

    fseek(pFile, 0, SEEK_END);
    fileSize = ftell(pFile);
    fseek(pFile, 0, SEEK_SET);

    auto buff = new char[fileSize + 1];
    fread(buff, 1, fileSize, pFile);
    fclose(pFile);

    buff[fileSize] = '\0';
    return  buff;
}

extern "C"
JNIEXPORT jstring

JNICALL
Java_com_hieutrantrung3_androidspecialcpp_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";

    char * filePath = "/sdcard/HieuTest";

    writeFile(filePath, hello.c_str(), hello.length());

    long size = 0;
    char* ss = readFile(filePath, size);

    __android_log_print(ANDROID_LOG_INFO, "HieuLog", "size: %d", size);
    __android_log_print(ANDROID_LOG_INFO, "HieuLog", "ss: %s", ss);

    return env->NewStringUTF(ss);
}
