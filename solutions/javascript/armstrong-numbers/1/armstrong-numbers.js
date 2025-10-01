//
// This is only a SKELETON file for the 'Armstrong Numbers' exercise. It's been provided as a
// convenience to get you started writing code faster.

export const isArmstrongNumber = (num) => {
  const bigNum = BigInt(num)
  const digits = bigNum.toString().split('').map(Number)
  return bigNum == digits.reduce(
    (acc, digit) => acc + BigInt(digit) ** BigInt(digits.length),
    BigInt(0));
};
