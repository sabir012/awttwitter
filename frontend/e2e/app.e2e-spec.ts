import { WebTechFrontEndPage } from './app.po';

describe('web-tech-front-end App', function() {
  let page: WebTechFrontEndPage;

  beforeEach(() => {
    page = new WebTechFrontEndPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
