const print = (i) => {
  if (i === 0) {
    return;
  }

  console.log(i);
  print(i - 1);
};

print(10);
