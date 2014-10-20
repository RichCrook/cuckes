Using Cucumber with Javascript
======

Cucumber allows managers, test engineers, and others to create acceptance tests
based on purely human-readable specification docs known as "feature files".

Running the tests
-----

From the top-level directory of this project:

    protractor specs/cucumber_config.js

Feature Files
-----

In this sample project, the feature files are in specs/cucumber. See the Cucumber
docs for the allowed values in this file.

Step Definitions
-----

Once your have one or more feature files, you must define javascript code that
defines how the steps of the features actually get done. These are defined
with regular expressions, and can be automatically generated if you run 
cucumber and it finds missing steps. 

So, your first step after making a new feature file is to run protractor. See
the cucumber_config.js in cases where you might need to add/expand abilities.

Once you have the sample code from the test run, you embed those steps within a
javascript file with this form:

    var chai = require('chai');
    var chaiAsPromised = require('chai-as-promised');
    chai.use(chaiAsPromised);

    var expect = chai.expect;

    module.exports = function() {
       // STEPS GO HERE
    };

NOTE: Cucumber uses Chai expect, and not Jasmine, so you must use the docs for those.

The most important thing to notice is that chai needs you to tell it when the thing 
you're using is a promise. You typically do that by adding in "eventually" to the
chain of the expectation:

    this.Then(/^I should see the greeting "([^"]*)"$/, function(message, next) {
      expect(element(by.binding('name')).getText()).
        to.eventually.equal(message).and.notify(next);
    });
