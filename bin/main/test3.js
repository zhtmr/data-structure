function makeCounter(predicate) {
  var counter = 0;
  return function() {
    counter = predicate(counter);
    return counter;
  };
}

function increase(n) {
  return ++n;
}

function decrease(n) {
  return --n;
}

const increaser = makeCounter(increase);
console.log(increaser);
console.log(increaser);
const decreaser = makeCounter(decrease);
console.log(decreaser);
console.log(decreaser);

// ===================================================================
// 생성자 함수
function Counter() {
  // 생성자 함수 Counter의 변수 counter는 this에 바인딩된 프로퍼티가 아니라 변수다.
  // 외부에서 Counter 인스턴스에 의해 참조할 수 없는 private 변수와 같다.
  // const counter = new Counter();
  // counter.counter (불가능)
  var counter = 0;

  // 메소드, 클로저
  // Counter의 프로퍼티인 this.increase는 클로저이기 때문에 변수 counter에 대한 정보를 기억하고있다. 접근가능
  this.increase = function() {
    return ++counter;
  };

  // 메소드, 클로저
  this.decrease = function() {
    return --counter;
  };
}

const counter = new Counter();

console.log(counter.increase());
console.log(counter.decrease());

// =======================================================================
var arr = [];

for(var i=0; i<5; i++){
    arr[i] = (function(id){
        return function(){
            return id;
        }
    }(i));
}

for(var j=0; j<arr.length; j++){
    console.log(arr[j]());
}


// =======================================================================

// 함수형 프로그래밍 고차함수
const arr = new Array(5).fill();

arr.forEach((v,i,array)=>array[i] = () => i);

arr.forEach(f => console.log(f()));
