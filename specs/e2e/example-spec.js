var fs = require('fs');

function writeScreenShot(data, filename) {
    var stream = fs.createWriteStream(filename);

    stream.write(new Buffer(data, 'base64'));
    stream.end();
}

afterEach(function() {
  var passed = jasmine.getEnv().currentSpec.results().passed();
  if (!passed) {
    browser.takeScreenshot().then(function(png) {
       writeScreenShot(png, 'exception.png');
    });
  }
});

describe("The index page", function() {

  it("Should greet me when I send in my name", function() {
    browser.get("/app/index.html");
    element(by.model('name')).sendKeys('Tony');
    element(by.id('send_button')).click();
    expect(element(by.binding('name')).getText()).toBe("Hello Tony.")
  });
});
