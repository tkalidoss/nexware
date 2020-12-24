'use strict'

var demoApp = angular.module('palindrome', [ 'ui.bootstrap', 'palindrome.controllers',
		'palindrome.services' ]);
demoApp.constant("CONSTANTS", {
	getAll : "/getAll",
	savePalindrome : "/save"
});