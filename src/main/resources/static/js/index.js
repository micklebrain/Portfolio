var $animation_elements = $('.animation-element');
var $window = $(window);

$( document )

function check_if_in_view() {

var $hackLists = $(".hackathons").find("li");
$.each($hackLists, function(index) {
  if (index%2 != 0) {
    var $element = $(this);
    $element.css("border", "none");
  }
})

console.log($hackLists);

  var $animation_elements = $('.animation-element');
  var window_height = $window.height();
  var window_top_position = $window.scrollTop();
  var window_bottom_position = (window_top_position + window_height);
 
  $.each($animation_elements, function() {
    var $element = $(this);
    var element_height = $element.outerHeight();
    var element_top_position = $element.offset().top;
    var element_bottom_position = (element_top_position + element_height);
 
    //check to see if this current container is within viewport
    if ((element_bottom_position >= window_top_position) &&
        (element_top_position <= window_bottom_position)) {
    	console.log("Adding class");
      $element.addClass('bar-expand all');
    } else {
    	console.log("removing class");
      $element.removeClass('bar-expand all');
    }
  });
}

$window.on('scroll resize', check_if_in_view);
$window.trigger('scroll');

