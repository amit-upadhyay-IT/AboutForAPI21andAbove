#AboutForAPI21andAbove

Now you can use this project as a library. To use it simply import the library in your android studio project.

# NOTE : here I have used the Butter Knife, so to use this as library you need to do these things : 

# add the plugin to your buildscript:

    buildscript {
      repositories {
        mavenCentral()
       }
      dependencies {
        classpath 'com.jakewharton:butterknife-gradle-plugin:8.4.0'
      }
    }

# and then apply it in your module:

    apply plugin: 'com.android.application'
    apply plugin: 'com.jakewharton.butterknife'

# Make sure you use R2 instead of R inside all Butter Knife annotations.

      class ExampleActivity extends Activity {
        @BindView(R2.id.user) EditText username;
        @BindView(R2.id.pass) EditText password;
      ...
      }

These things are already done by me inside the library. But you also need to do these above things in your project.
