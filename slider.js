const images = ["image1.jpg", "image2.jpg", "image3.jpg"];
let currentIndex = 0;

document.getElementById("next").addEventListener("click", function() {
  currentIndex = (currentIndex + 1) % images.length;
  document.getElementById("slide").src = images[currentIndex];
});

document.getElementById("prev").addEventListener("click", function() {
  currentIndex = (currentIndex - 1 + images.length) % images.length;
  document.getElementById("slide").src = images[currentIndex];
});
