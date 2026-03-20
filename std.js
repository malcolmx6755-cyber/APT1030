const readline = require("readline").createInterface({
    input: process.stdin,
    output: process.stdout,
});

readline.question("Enter student name:",(name)=>{
    readline.question("Enter number of registered units:",(unitsStr)=>{
        const units=parseInt(unitsStr);
        let status = units > 7? "Overload - Approval Required":"Registration Accepted";

        console.log("NAME:" + name);
        console.log("Units registered:"+ units);
        console.log("Staus:"+status);

        readline.close();
    });
});