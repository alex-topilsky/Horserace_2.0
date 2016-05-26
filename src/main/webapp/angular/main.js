'use strict';


angular.module('Login', []);
angular.module('Registration', []);


var app = angular.module('main', [
    'Login',
    'Registration'])
    .config(function ($stateProvider, $urlRouterProvider, $httpProvider) {
    $urlRouterProvider.when('', '/login').when('/', '/login');

            $stateProvider.state('login', {
                url: '/login',
                controller: 'LoginController',
                templateUrl: './angular/websites/login.html'
                })
                .state('registration', {
                    url: '/registration',
                    controller: 'RegistrationController',
                    templateUrl: './angular/websites/registration.html'
                })
                .state('main', {
                    url: '/',
                    controller: '',
                    templateUrl: ''
                });

            $httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';

        }).run(function () {});