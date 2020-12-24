'use strict'

var module = angular.module('palindrome.controllers', []);
module.controller("PalindromeController", [ "$scope", "$window", "PalindromeService",
		function($scope, $window, PalindromeService) {

			$scope.orderByField = 'list';
			$scope.reverseSort = false;

			$scope.dto = {
				list : null
			};


			$scope.palindromes = [];

			PalindromeService.getAll().then(function(value) {
				console.log(value.data);
				$scope.palindromes= value.data;
			}, function(reason) {
				console.log("error occured");
			}, function(value) {
				console.log("no callback");
			});

			$scope.save = function(list) {
				var regex = /^[a-zA-Z]+$/;
				if ($scope.dto.list && $scope.dto.list.match(regex)) {
					PalindromeService.savePalindrome($scope.dto).then(function(value) {
						$scope.palindromes = [];
						$scope.dto = {
							list : null
						};
						$window.location.reload();
					}, function(value) {
						$window.alert("Given string doesn't pass the validation")
					}, function(response) {
						console.log("no callback");
					});
					return true;
				} else {
					return false;
				}
			}

		} ]);