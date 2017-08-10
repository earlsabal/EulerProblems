def largest_prime_factor(num)

	primes_list = find_all_primes(num)
	largest_prime = primes_list.last

	largest_prime

end

def find_all_primes(max)

	primes = []

	current_number = 2
	while current_number <= max
		primes << current_number if prime?(current_number, primes)
		max = reduce_num(current_number, max)
		current_number += 1
	end

	primes

end

def prime?(number, primes)

	status = true
	primes.each do |prime|
		status = false if number % prime == 0
	end
	
	status

end

def reduce_num(divisor, number)

	new_number = number
	new_number = new_number / divisor while new_number % divisor == 0 
	new_number

end

# Tracks time
start = Time.now
puts largest_prime_factor(600851475143)
# Answer: 6857
puts "Execution time: #{Time.now - start}"
# Time Elasped: 0.405119
