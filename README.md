# Advanced-Network-Security-Coursework

## Requirements
- npm (>= 6.14.4)
- node (>= 10.19.0)

## Setup
1. Install HTTP server dependencies - change to `http-server` directory and run `npm install`.
2. Install LDAP server dependencies - change to `ldap-server` directory and run `npm install`.

## Running the demo
1. Compile the exploit class using `./gradlew exploit:compileKotlin` or running `Compile Exploit` run configuration.
2. Start HTTP server using `node http-server/server.js`
3. Start LDAP server using `node ldap-server/server.js`
4. Run the main application by running `Application` run configuration.