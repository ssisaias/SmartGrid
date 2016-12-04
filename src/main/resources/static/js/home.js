/**
 * 
 */

var gaugeChart = AmCharts.makeChart("chartdiv", {
	"type" : "gauge",
	"faceBorderAlpha" : -7,
	"theme" : "default",
	"arrows" : [ {
		"id" : "GaugeArrow-1"
	} ],
	"axes" : [ {
		"bottomText" : "0 kW",
		"bottomTextYOffset" : -10,
		"endValue" : 300,
		"id" : "GaugeAxis-1",
		"valueInterval" : 0,
		"bands" : [ {
			"color" : "#00CC00",
			"endValue" : 90,
			"id" : "GaugeBand-1",
			"startValue" : 0
		}, {
			"color" : "#ffac29",
			"endValue" : 160,
			"id" : "GaugeBand-2",
			"startValue" : 90
		}, {
			"color" : "#ea3838",
			"endValue" : 300,
			"id" : "GaugeBand-3",
			"innerRadius" : "95%",
			"startValue" : 160
		} ]
	} ],
	"allLabels" : [],
	"balloon" : {
		"animationDuration" : 0
	},
	"titles" : [ {
		"id" : "Title-1",
		"size" : 15,
		"text" : "Consumo em kW"
	} ]
});

setInterval( getWattAtual, 3000 );
//
//// set random value
//function randomValue() {
//  var value = Math.round( Math.random() * 300 );
//  if ( gaugeChart ) {
//    if ( gaugeChart.arrows ) {
//      if ( gaugeChart.arrows[ 0 ] ) {
//        if ( gaugeChart.arrows[ 0 ].setValue ) {
//          gaugeChart.arrows[ 0 ].setValue( value );
//          gaugeChart.axes[ 0 ].setBottomText( value + " kW" );
//        }
//      }
//    }
//  }
//}

function getWattAtual() {
	$.ajax({
		url : 'http://localhost:8080/getconsumo',
		dataType : 'json',
		success : function(data) {
			var totalItems = data.length;
			//alert('Watts: ' + data[totalItems-1].totalWatts);
			var value = data[totalItems-1].totalWatts;
			if (gaugeChart) {
				if (gaugeChart.arrows) {
					if (gaugeChart.arrows[0]) {
						if (gaugeChart.arrows[0].setValue) {
							gaugeChart.arrows[0].setValue(value);
							gaugeChart.axes[0].setBottomText(value + " kW");
						}
					}
				}
			}
		},
		error : function() {
			alert('Erro ao obter dados do servidor');
		}
	});
}

window.onload = getWattAtual;
