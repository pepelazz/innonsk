
$(document).ready ->

#  ------ menu animation
  url = window.location.href
  temp = new Array()
  temp = url.split('/')
  b = '/' + temp[3]

  $("#main-menu li a").each ->
    if $(this).attr('href') == b
      $(this).parent('li').addClass('active')

#-------- tooltip activation script
  $("[rel=tooltip]").tooltip() if  $("[rel=tooltip]").length

