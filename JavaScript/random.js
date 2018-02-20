// Function returns random number between 1 and 11
function rand11() {
    return Math.floor(Math.random() * 12) + 1;
}

// Function returns random number between 1 and 13
function rand13() {
    var r13 = 0;
    for(var i = 1; i <= 13; i++)
        r13 += rand11() * i;
    return r13 % 13 + 1;
}

// Array to hold frequency of values generated randomly between 1 and 13
var freq = Array(11);

// Initialize array to 0
for(var i = 0; i < 13; i++)
    freq[i] = 0;

// Run 100,000 times
for(var i = 0; i < 100000; i++)
    freq[rand13()-1]++;

// Print the frequencies
for(var i = 0; i < 13; i++)
    console.log(i+1 + "\t" + freq[i]);