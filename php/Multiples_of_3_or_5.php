function solution($number){
$sum = 0;
  $number--;
  while($number>2){
    $sum += ($number%3==0||$number%5==0)?$number:0; 
    
    $number--;
  }
  return $sum;
}
