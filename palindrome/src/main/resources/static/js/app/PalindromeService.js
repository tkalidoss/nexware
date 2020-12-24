'use strict'

angular.module('palindrome.services', []).factory('PalindromeService',
		[ "$http", "CONSTANTS", function($http, CONSTANTS) {
			var service = {};
			service.getAll = function() {
				return $http.get(CONSTANTS.getAll);
			}
			service.savePalindrome = function(userDto) {
				return $http.post(CONSTANTS.savePalindrome, userDto);
			}
			return service;
		} ]);