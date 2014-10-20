var chai = require('chai');
var chaiAsPromised = require('chai-as-promised');
chai.use(chaiAsPromised);

var expect = chai.expect;

module.exports = function() {
  this.Then(/^There is an input field for my name$/, function(next) {
    var hasInput = element(by.model("name")).isPresent();
    expect(hasInput).to.eventually.be.true.and.notify(next);
  });
};
