Cukes
=====

This sample project is for experimenting with e2e testing of Angular (and other)
web UIs. It also contains examples for dealing with Acceptance Tests against a
UI using Cucumber.

It also contains Cucumber JVM which is runnable through Maven with:

   mvn test

It should be relatively easy to hook the UI/protractor e2e and acceptance tests
(TODO) up to a maven profile.

Setup
=====

NOTE: These steps assume you are in the same directory as this file.

1. Update your local PATH environment variable to include node_modules/.bin

    PATH=$PATH:node_modules/.bin

    You could also add node_modules/.bin to your PATH in .profile

    Realize that this means most commands will require you to be in THIS directory
    when you run them, and not in a subdirectory, since you're adding a relative path.

2. Make sure you have nodejs and npm installed (requires MacPorts):

    sudo port install nodejs npm

3. Use npm to install the javascript bits of this project:

    npm install

4. You should now have additional commands, one of which is webdriver-manager
   (see step 1). You can install the things it needs with:

    webdriver-manager update --standalone

Running Specifications
=======

You must have the following:

1. A running webdriver
2. A running application

Running the Webdriver Server
-------

Once you have everything installed, you can now start a webdriver server (this
can also be set up on a remote machine). This is where the "test browser" will
run.

    webdriver-manager [--seleniumPort #] start

Running the application
--------

A node.js server is in this directory. To run it, simply run:

    node app.js

you can then access the app at http://localhost:3000/index.html

Running the Specifications
--------

The specifications are run by protractor. The protractor_config.js file is the config.

1. Pure Jasmine end to end 

    protractor specs/end2End_config.js

2. Cucumber feature scenarios:

    protractor specs/cucumber_config.js

