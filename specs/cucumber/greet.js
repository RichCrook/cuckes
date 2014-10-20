var chai = require('chai');
var chaiAsPromised = require('chai-as-promised');
chai.use(chaiAsPromised);

var expect = chai.expect;

module.exports = function() {
  this.Given(/^I am on the index page$/, function(next) {
    browser.get("/app/index.html");
    next();
  });

  this.Given(/^I type in the name "([^"]*)"$/, function(name, next) {
      element(by.model('name')).sendKeys(name);
      next();
      });

  this.When(/^I click send$/, function(next) {
    element(by.id('send_button')).click();
    next();
  });

  this.Then(/^I should see the greeting "([^"]*)"$/, function(message, next) {
    expect(element(by.binding('name')).getText()).
      to.eventually.equal(message).and.notify(next);
  });
};
