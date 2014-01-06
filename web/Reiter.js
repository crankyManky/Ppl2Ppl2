$(document).ready(
		function() {

			console.log("bla");
			var tabs = ".tabs li";
			var activeclass = "active";

			$(function() {
				$(tabs).click(
						/* statt "click" kann auch "hover" verwendet werden */
						function() {
							$(this).siblings().removeClass(activeclass);
							$(this).addClass(activeclass);
							$(this).parent().next(".content").find(".box")
									.hide().eq($(this).index()).show();
						});

				// /* weiter/zurück Navigation */
				// $(".next, .prev").click(
				// function () {
				// var el = $(this).parent().find(tabs);
				// var current = $(el).closest("." + activeclass).index();
				// var first = el.first().index();
				// var all = el.last().index();
				//
				// direction = false;
				// if($(this).hasClass("next")) { direction = true; }
				// if(direction) { current++; } else { current--; }
				// if(current < 0) { current = all; }
				// if(current > all) { current = first; }
				//
				// el.eq(current).click();
				// }
				// );
			});
		});
