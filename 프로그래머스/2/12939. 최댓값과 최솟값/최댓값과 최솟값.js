function solution(s) {    
    let splitedS = s.split(" ");
    splitedS.sort((a, b) => a - b);
    
    return splitedS[0] + " " + splitedS[splitedS.length - 1];
}