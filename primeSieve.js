const NUMBER = 100
const sieve = (arr) =>{
    for(let i = 2 ;i< Math.sqrt(arr.length);i++){
        for(let j = 2;j<=arr.length / i;j++){
            arr[(i*j)-1] = false;
        }
    }
    return arr
}
const main = (size) => {
    let arr =[]
    for(let i = 1 ;i<=size;i++){
        arr.push(true);
    }
    arr[0] = false
    arr = sieve(arr)
    for(let i=0;i<arr.length;i++){
        if(arr[i]){
            console.log(i+1)
        }
    }
}
main(NUMBER)