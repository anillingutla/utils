#!groovy

// Methods in this file will end up as object methods on the object that load returns.
def call(def str) {
   //def myVar = build.getEnvironment(listener).get('myVar')
   echo "Look at this, ${str}! You loaded this from another file!"
}
   
return this;
