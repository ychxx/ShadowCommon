-keep class kotlin.** { *; }
-keep class kotlin.Metadata { *; }
-keep class com.yc.commonlib.**{*;}

-keepattributes *Annotation*
-keep class retrofit2.** { *; }
-keepclasseswithmembers class * {
@retrofit.http.* <methods>; }
-keepattributes Signature


-keep class com.google.gson.** { *; }
-keep class com.google.inject.** { *; }
-keep class org.apache.http.** { *; }
-keep class org.apache.james.mime4j.** { *; }
-keep class javax.inject.** { *; }






-keepattributes Signature, InnerClasses, EnclosingMethod

-keepattributes RuntimeVisibleAnnotations, RuntimeVisibleParameterAnnotations
-keepclassmembers,allowshrinking,allowobfuscation interface * {
    @retrofit2.http.* <methods>;
}
-dontwarn org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
-dontwarn javax.annotation.**
-dontwarn kotlin.Unit
-dontwarn retrofit2.KotlinExtensions
-dontwarn retrofit2.KotlinExtensions$*
-if interface * { @retrofit2.http.* <methods>; }
-keep,allowobfuscation interface <1>