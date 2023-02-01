const fs = require('fs');
const path = require('path');
const readline = require('readline');

// let id = 12;
const folder = '../java';

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const writeFile = () => {
    rl.question('Enter file name (or type exit to stop): ', (filename) => {
        if (filename === 'exit') {
            console.log('Exiting program.');
            rl.close();
            return;
        }
        fs.mkdir(folder, { recursive: true }, (err) => {
            if (err) {
                console.error(err);
            }
            const code = `import java.util.Scanner;

            public class ID_${filename} {
                public static void main(String[] args) {

                    
                    sc.close();
                }
            }`;
            // const code = `public class ID_${filename} {\n\n}`;
            fs.writeFile(path.join(folder, `ID_${filename}.java`), code, (err) => {
                if (err) {
                    console.error(err);
                } else {
                    console.log(`The file "${folder}/ID_${filename}.java" has been created.`);
                }
                // id++;
                writeFile();
            });
        });
    });
};

writeFile();
