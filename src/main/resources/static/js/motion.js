/**
 * 
 */

  var swiper = new Swiper(".mySwiper", {
      spaceBetween: 30,
      centeredSlides: true,
      loop: true,
      autoplay: {
        delay: 2500,
        disableOnInteraction: false,
      },
      pagination: {
        el: ".swiper-pagination",
        clickable: true,
      },
      navigation: {
        nextEl: ".swiper-button-next",
        prevEl: ".swiper-button-prev",
      },
    });
    
    var swiper = new Swiper("#thumbSwiper", {
        slidesPerView: 1,
        spaceBetween: 10,
        loop: true,
        breakpoints: {
          200: {
            slidesPerView: 5,
            spaceBetween: 15
          }
        }
      });