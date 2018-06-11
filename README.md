# ZRxJavaUtil

自己封装的一个崩溃日志管理，保存崩溃时日志到本地，方便查看

# 使用方法

> Step 1\. Add the JitPack repository to your build file

```
    allprojects {
        repositories {
            ...
            maven { url 'https://jitpack.io' }
        }
    }
```
> Step 2\. Add the dependency
```
    dependencies {
         implementation 'com.github.JueShouGitHub:CrashLogcatHelper:-SNAPSHOT''
    }
```

然后使用方法：
    在Application里面初始化：
    
```
    public class MyApplication extends Application {
        @Override
        public void onCreate() {
            super.onCreate();
            //第二个参数为要保存日志的文件夹名称，就在更目录下面
            //第三个参数booble值，表示是否开启保存日志，
            CrashLogcatHelper.getInstance().init(this,"CrashTest",true);
            //设置保存天数
            CrashLogcatHelper.setDays(0);
        }
    }
```
    然后就可以愉快的使用了^_^!
    
