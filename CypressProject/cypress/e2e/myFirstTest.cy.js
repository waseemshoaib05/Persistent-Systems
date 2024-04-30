// write a test case to verify Google page videos

// it('Google Search', function(){
//     cy.visit('https://google.com')
// })

it('Google Search1', ()=>{
    cy.visit('https://google.com')
    cy.get('#APjFqb').type('Automation')
})