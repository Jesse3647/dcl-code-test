# dcl-code-test

Using JDK 11, node v12.22.11, npm v8.5.5
```
npm install -g @angular/cli@13.3.4
npm install
```

A fork from [here](https://github.com/fityp/dcl-code-test).

## To Whom It May Concern :)

I didn't have any problems getting the Spring project to run right out the gate, however I did have a few issues getting the 
Angular application to build. First of all, I couldn't get `@angular/cli@1.7.4` to install because of a weird dependency it had
on Python. I also had issues running `npm install` because it would timeout on downloading the packages. Turns out that's because 
the `package-lock.json` file included references to an internal NPM server which I could not access. 

Anyway, I ended up rescaffolding the entire Angular application using the latest Angular CLI and was able to complete the exercise. 
Please let me know if there's anything left for me to do....

--Jesse
